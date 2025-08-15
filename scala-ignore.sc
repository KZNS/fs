#!/usr/bin/env -S scala-cli shebang
//> using repository jitpack
//> using dep com.github.kzns:srun:224f3a1

import srun.tool.*

os.write.append(
  os.pwd / ".gitignore",
  """# IDE and Tools
    |## VS Code
    |.vscode/
    |.bsp/
    |.metals/
    |.bloop/
    |metals.sbt
    |## scala-cli
    |.scala-build/
    |*.scala.semanticdb
    |## Mill
    |out/
    |## build
    |build/
    |target/
    |
    |# System
    |.DS_Store
    |
    |# Project
    |""".stripMargin
)
