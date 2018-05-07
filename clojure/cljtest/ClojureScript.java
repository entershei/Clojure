package cljtest;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import jstest.Engine;
import jstest.EngineException;

/**
 * @author Georgiy Korneev (kgeorgiy@kgeorgiy.info)
 */
public class ClojureScript {
    public ClojureScript(final String script) {
        Clojure.var("clojure.core", "load-file").invoke(script);
    }

    protected <T> Engine.Result<T> call(final IFn f, final Object[] args, final Class<T> type, final String context) {
        final Object result;
        try {
            result = callUnsafe(f, args);
        } catch (final Throwable e) {
            throw new EngineException("No error expected in " + context, e);
        }
        if (result == null) {
            throw new EngineException(String.format("Expected %s, found null\n%s", type.getSimpleName(), context), null);
        }
        if (!type.isAssignableFrom(result.getClass())) {
            throw new EngineException(String.format("Expected %s, found %s (%s)\n%s", type.getSimpleName(), result, result.getClass().getSimpleName(), context), null);
        }
        return new Engine.Result<>(context, type.cast(result));
    }

    private Object callUnsafe(final IFn f, final Object[] args) {
        return args.length == 0 ? f.invoke()
                : args.length == 1 ? f.invoke(args[0])
                : args.length == 2 ? f.invoke(args[0], args[1])
                : args.length == 3 ? f.invoke(args[0], args[1], args[2])
                : args.length == 4 ? f.invoke(args[0], args[1], args[2], args[3])
                : args.length == 5 ? f.invoke(args[0], args[1], args[2], args[3], args[4])
                : f.invoke(args);
    }

    public Engine.Result<Throwable> expectException(final IFn f, final Object[] args, final String context) {
        try {
            callUnsafe(f, args);
        } catch (final Throwable e) {
            return new Engine.Result<>(context, e);
        }
        assert false : "Exception expected in " + context;
        return null;
    }

    public <T> ClojureFunction<T> function(final String name, final Class<T> type) {
        return new ClojureFunction<>(this, name, type);
    }
}
