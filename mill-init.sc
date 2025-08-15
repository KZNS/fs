#!/usr/bin/env -S scala-cli shebang
//> using repository jitpack
//> using dep com.github.kzns:srun:224f3a1

import srun.tool.*

val millVersion = "1.0.3"

// download mill
Bash(s"curl -L https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/${millVersion}/mill-dist-${millVersion}-mill.sh -o mill").run()
Bash("chmod +x mill").run()

// init mill project
Bash(s"echo \"//| mill-version: ${millVersion}\" > build.mill").run()

// init mill tab completion
Bash("./mill mill.tabcomplete/install").run()
Bash("./mill version").run()
