import org.scalatest.FunSuite
import de.hars.scalaxml._


/**
 * User: Steve Levine
 * Date: Mar 21, 2010
 * Copyright 2010 blue64.net. All rights reserved.
 *
 * Simple class to exercise the scala xml library.
 */

class ScalaXMLTestSuite extends FunSuite {
 
  val url = "http://www.scala-lang.org"
  val TITLE = "The Scala Programming Language"

  test("parsing url with nekoHtml") {
    val neko = new NekoHTMLFactoryAdapter load url
    val title = neko \\ "TITLE"
	
	assert(title.text === TITLE)
  }

  test("parsing url with tagSoup") {
    val tagSoup = new TagSoupFactoryAdapter load url
    val title = tagSoup \\ "title"
	assert(title.text === TITLE)
  }
 
  test("parsing url with htmlCleaner") {
    val htmlCleaner = new HTMLCleanerFactoryAdapter load url
    val title = htmlCleaner \\ "title"
	assert(title.text === TITLE)
  }

}