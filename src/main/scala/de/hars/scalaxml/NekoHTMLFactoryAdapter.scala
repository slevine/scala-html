/* © 2009 Florian Hars */
package de.hars.scalaxml

import org.cyberneko.html.parsers.SAXParser

class NekoHTMLFactoryAdapter extends SAXFactoryAdapter
                             with HTMLFactoryAdapter
{
  def getReader() = new SAXParser
}
