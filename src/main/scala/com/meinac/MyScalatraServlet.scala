package com.meinac

import net.liftweb.json.Serialization
import org.scalatra._
import com.meinac.repository._
import net.liftweb.json.Serialization.{read, write}
import net.liftweb.json.NoTypeHints

class MyScalatraServlet extends HelloscalatraStack {

  implicit val formats = Serialization.formats(NoTypeHints);

  get("/items/:id") {
    contentType = "application/json"

    ItemRepository.get(params("id").toInt) match {
      case Some(x) => Ok(write(x));
      case None => NotFound("Item with id " + params("id") + " not found");
    }

  }

}
