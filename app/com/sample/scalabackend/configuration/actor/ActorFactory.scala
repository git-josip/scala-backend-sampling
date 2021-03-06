package com.sample.scalabackend.configuration.actor

import akka.actor.{Props, ActorSystem}
import akka.routing.FromConfig
import com.sample.scalabackend.module.log.action.actor.ActionLogActor

object ActorFactory
{
  val actorSystem = ActorSystem("scalabackendsampling")

  val actionLogActorRouter = actorSystem.actorOf(Props[ActionLogActor].withRouter(FromConfig()), name = "actionLogActorRouter")
}
