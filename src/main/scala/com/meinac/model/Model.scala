package com.meinac.model

/**
 * Created by mehmetinac on 21/02/15.
 */
case class Item(
                  name:String,
                  id: Number,
                  startPrice: Number,
                  currency: String,
                  description: String,
                  links: List[Link]
                  )
case class Link(
                 linkType: String,
                 rel: String,
                 href: String
                 )

case class Bid(
                id: Option[Long],
                forItem: Number,
                minimum: Number,
                maximum: Number,
                currency: String,
                bidder: String,
                date: Long
                )
