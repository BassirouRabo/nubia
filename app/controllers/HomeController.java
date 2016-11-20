package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

/**
 * Created by smalllamartin on 11/19/16.
 */
public class HomeController extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result about() {
        return ok(about.render());
    }

    public Result teams() {
        return ok(teams.render());
    }

    public Result catalogs() {
        return ok(catalogs.render());
    }

    public Result contact() {
        return ok(contact_us.render());
    }

    public Result join () {
        return ok(join_us.render());
    }

}