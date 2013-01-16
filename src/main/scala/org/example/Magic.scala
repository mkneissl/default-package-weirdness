// Must import from within the default package, only a wildcard works.
import InDefault._

package org.example {

  // won't compile here unless the import in the default package is done!
  import InDefault._

  object OutSidedDefault {
    // Following only compiles with the import in the default package !?!
    def canQualifyIt = InDefault.Hello

    def canUseTheImport = Hello

    // Won't compile
    // def cantRootImportIt = _root_.InDefault.Hello
  }
}
