package controllers

//import play.api._

import play.api.mvc._
import org.json4s._
import org.json4s.native.JsonMethods
import org.json4s.JsonDSL._
import org.json4s.native.JsonMethods._



object AjaxApplication extends Controller {
  
  def products = Action {
    val pro1=("id"->0) ~ ("title"->"Paint pots") ~ ("description"->"Pots full of paint") ~("price"->3.95)
    val pro2=("id"->1) ~ ("title"->"Polka dots") ~ ("description"->"Dots with that polka groove") ~("price"->12.95)
    val pro3=("id"->2) ~ ("title"->"Pebbles") ~ ("description"->"Just little rocks,really") ~("price"->6.95)
    Ok(compact(JsonMethods.render(List(pro1,pro2,pro3))))


  }
}