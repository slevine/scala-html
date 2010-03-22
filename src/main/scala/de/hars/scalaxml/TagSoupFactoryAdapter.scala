/* © 2009 Florian Hars */
package de.hars.scalaxml

import org.ccil.cowan.tagsoup.jaxp.SAXFactoryImpl 

class TagSoupFactoryAdapter extends SAXFactoryAdapter
                            with HTMLFactoryAdapter
{
  private val parserFactory = new SAXFactoryImpl
  parserFactory.setNamespaceAware(true)

  def getReader() = parserFactory.newSAXParser().getXMLReader()
}
