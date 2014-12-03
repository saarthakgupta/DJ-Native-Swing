/*
 * Christopher Deckers (chrriis@nextencia.net)
 * http://www.nextencia.net
 *
 * See the file "readme.txt" for information on usage and redistribution of
 * this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package chrriis.dj.nativeswing.swtimpl;

/**
 * An abstract adapter class for receiving native interface events.
 * @author Christopher Deckers
 */
public abstract class NativeInterfaceAdapter implements NativeInterfaceListener {

  @Override
public void nativeInterfaceClosed() {
  }

  @Override
public void nativeInterfaceInitialized() {
  }

  @Override
public void nativeInterfaceOpened() {
  }

}
