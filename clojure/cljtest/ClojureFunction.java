package cljtest;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import jstest.Engine;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Georgiy Korneev (kgeorgiy@kgeorgiy.info)
 */
public class ClojureFunction<T> {
    private final ClojureScript script;
    private final String name;
    private final Class<T> type;
    private final IFn f;

    public ClojureFunction(final ClojureScript script, final String name, final Class<T> type) {
        this.script = script;
        this.name = name;
        this.type = type;
        f = Clojure.var("clojure.core", name);
    }

    public Engine.Result<T> call(final Engine.Result<?>... args) {
        return script.call(
                f,
                Arrays.stream(args).map(arg -> arg.value).toArray(),
                type,
                "(" + name + " " + Arrays.stream(args).map(arg -> arg.value.toString()).collect(Collectors.joining(" ")) + ")"
        );
    }

    public Engine.Result<Throwable> expectException(final Engine.Result<?>... args) {
        return script.expectException(
                f,
                Arrays.stream(args).map(arg -> arg.value).toArray(),
                "(" + name + " " + Arrays.stream(args).map(arg -> arg.value.toString()).collect(Collectors.joining(" ")) + ")"
        );
    }
}
