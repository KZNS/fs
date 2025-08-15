#!/usr/bin/env -S scala-cli shebang
//> using repository jitpack
//> using dep com.github.kzns:srun:224f3a1

import srun.tool.*

os.write.append(
  os.pwd / ".scalafmt.conf",
  """maxColumn = 120
    |docstrings.wrapMaxColumn = 80
    |align.preset = more
    |""".stripMargin
)
