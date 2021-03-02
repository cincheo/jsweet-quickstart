package def.es6;

import def.js.Promise;
import def.whatwg_fetch.Response;
import def.whatwg_fetch.Request;
import jsweet.lang.Interface;


@Interface
public abstract class FetchEvent extends def.dom.Event {
  public native void respondWith(Promise<Response> response);
  public Request request;
}
