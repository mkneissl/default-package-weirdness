/*
  The presence of any object definition in the empty package in the same
  file lets us use other objects in the empty package from other packages.
  Scala Bug or Feature?
*/

object MagicDust

package org.example {

  // won't compile here without the MagicDust above
  import InDefault._

  object Magic {
    // Following only compiles with the import in the default package !?!
    def canQualifyIt = InDefault.Hello

    def canUseTheImport = Hello

    // Won't compile
    // def cantRootImportIt = _root_.InDefault.Hello
  }
}
