package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }


  def bookfirst = Action {
    Ok(views.html.bookfirst("title"))
  }

  def booksecond = Action {
    Ok(views.html.booksecond("title"))
  }

  def shopingcart = Action {
    Ok(views.html.shopingcart("title"))
  }

  def shopingcart2 = Action {
    Ok(views.html.shopingcart2("title"))
  }

  def first = Action {
    Ok(views.html.first("title"))
  }

  def step0 = Action {
    Ok(views.html.step0())
  }

  def step1 = Action {
    Ok(views.html.step1())
  }

  def step2 = Action {
    Ok(views.html.step2())
  }

  def step3 = Action {
    Ok(views.html.step3())
  }


  def step4=Action{
    Ok("hello")
  }
  
}