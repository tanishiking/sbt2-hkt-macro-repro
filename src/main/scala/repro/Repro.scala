package repro

import sbt.*
import sbt.Keys.*

object Repro {
  final class IO[A]

  object Builder {
    def apply[F[_]](value: String): String = value
  }

  val reproSetting: Def.Initialize[String] = Def.setting {
    Builder[IO](name.value)
  }

  val reproTask: Def.Initialize[Task[String]] = Def.task {
    Builder[IO](name.value)
  }
}
