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

    public Result teamsJannaSow() {
        return ok(teams_janna_sow.render());
    }

    public Result teamsElsieAugustava() {
        return ok(teams_elsie_augustava.render());
    }

    public Result teamsMathieuGbetro() {
        return ok(teams_mathieu_gbetro.render());
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