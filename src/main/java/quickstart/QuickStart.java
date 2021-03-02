package quickstart;

import def.dom.Globals;
import def.es6.FetchEvent;
import def.js.Promise;
import def.whatwg_fetch.Response;
import def.whatwg_fetch.Request;

import static jsweet.util.Lang.asyncReturn;

import jsweet.lang.Async;


/**
 * This class is used within the webapp/index.html file.
 */
public class QuickStart {

  public static void main(String[] args) {
    Globals.self.addEventListener("fetch", (event) -> {
        FetchEvent e = (FetchEvent) event;
        e.respondWith(handleRequest(e.request));
      });
  }

  @Async
  public static Promise<Response> handleRequest(Request request) {
    // make sure bundling multiple files is working
    String secret = SomeOther.secret;
    return asyncReturn(new Response("Hello from Java via JSweet, your value from another class is " + secret + "\n"));
  }
}
