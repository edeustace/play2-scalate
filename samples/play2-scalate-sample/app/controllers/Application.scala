package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def indexWithMustache(name:String) = Action {implicit request=>
    Ok(Template.render("index.mustache",Map(
      "name"->name,
      "value" -> 10000,
      "taxed_value" -> (10000 - (10000 * 0.4)),
      "in_ca" -> true
    )))
  }

  def indexWithJade() = Action{ implicit request =>
    Ok(Template.render("sample.jade"))
  }
  
}