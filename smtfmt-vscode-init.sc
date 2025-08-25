#!/usr/bin/env -S scala-cli shebang
//> using repository jitpack
//> using dep com.github.kzns:srun:c33a797

import srun.tool.*

val wkdir = os.pwd / ".vscode"
os.makeDir.all(wkdir)

Bash("curl -L liuyic00.github.io/smtfmt/init.sh | sh").call(cwd = wkdir)
Bash("scala-cli --power package smtfmt.sc -o smtfmt --assembly -f").call(cwd = wkdir)
os.write.append(
  wkdir / "settings.json",
  """|{
     |  "customLocalFormatters.formatters": [
     |    {
     |      "command": ".vscode/smtfmt",
     |      "languages": [
     |        "smt",
     |        "smt-lib"
     |      ]
     |    }
     |  ]
     |}
     |""".stripMargin
)
