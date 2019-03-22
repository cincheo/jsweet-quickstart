package quickstart;

import static def.dom.Globals.alert;
import static def.jquery.Globals.$;

import java.util.ArrayList;
import java.util.List;

import def.js.Array;

/**
 * This class is used within the webapp/index.html file.
 */
public class QuickStart {

	public static void main(String[] args) {
		
		// you can use regular Java API
		List<String> l = new ArrayList<>();
		l.add("Hello");
		l.add("world");
		// and you can also use regular JavaScript APIs
		Array<String> a = new Array<>();
		a.push("Hello", "world");
		// use of jQuery with the jQuery candy
		$("#target").text(l.toString());
		// use of the JavaScript DOM API
		alert(a.toString());
	}

}
