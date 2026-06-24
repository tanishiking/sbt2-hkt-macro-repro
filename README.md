# sbt 2 HKT macro repro

sbt 2 macro crash when `Def.setting` or `Def.task` contains a generic call with a higher-kinded type argument.

```sh
$ sbt compile

Exception occurred while executing macro expansion.
scala.MatchError: scala.quoted.runtime.impl.TypeImpl
  at sbt.internal.util.appmacro.Convert$appTransformer$2$.transformTerm(Convert.scala:66)
  ...
```

