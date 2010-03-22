import sbt._

/**
 * User: Steve Levine
 * Date: Mar 21, 2010
 * Copyright 2010 blue64.net. All rights reserved.
 *
 * Simple Scala Simple Build Tool Config.
 */

class scalaxml(info: ProjectInfo) extends DefaultProject(info) {
  
  val tagsoup = "tagsoup" % "tagsoup" % "1.2" from "http://home.ccil.org/~cowan/XML/tagsoup/tagsoup-1.2.jar"

  val htmlcleaner = "htmlcleaner" % "htmlcleaner" % "2.1" from "http://htmlcleaner.sourceforge.net/download/htmlcleaner2_1.jar"

  val xercesImpl = "xerces" % "xercesImpl" % "2.9.1"

  val xalan = "xalan" % "xalan" % "2.7.1"

  val nekohtml = "nekohtml" % "nekohtml" % "1.9.6"

  val scalaTest = "org.scalatest" % "scalatest" % "1.0"  
}