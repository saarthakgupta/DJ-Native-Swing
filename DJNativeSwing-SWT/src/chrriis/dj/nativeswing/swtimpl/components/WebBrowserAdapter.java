/*
 * Christopher Deckers (chrriis@nextencia.net)
 * http://www.nextencia.net
 *
 * See the file "readme.txt" for information on usage and redistribution of
 * this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package chrriis.dj.nativeswing.swtimpl.components;


/**
 * An abstract adapter class for receiving web browser events.
 * @author Christopher Deckers
 */
public abstract class WebBrowserAdapter implements WebBrowserListener {

  @Override
public void windowWillOpen(WebBrowserWindowWillOpenEvent e) {}
  @Override
public void windowOpening(WebBrowserWindowOpeningEvent e) {}
  @Override
public void windowClosing(WebBrowserEvent e) {}

  @Override
public void locationChanging(WebBrowserNavigationEvent e) {}
  @Override
public void locationChanged(WebBrowserNavigationEvent e) {}
  @Override
public void locationChangeCanceled(WebBrowserNavigationEvent e) {}

  @Override
public void loadingProgressChanged(WebBrowserEvent e) {}
  @Override
public void titleChanged(WebBrowserEvent e) {}
  @Override
public void statusChanged(WebBrowserEvent e) {}

  @Override
public void commandReceived(WebBrowserCommandEvent e) {}

}
