package com.cisco.vertex;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Starter;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;

public class ConsumerVertex extends AbstractVerticle{

	@Override
	public void start(Future<Void> startFuture)
	{
		System.out.println("My Verticle Started :Second");
		vertx.eventBus().consumer("Channel1", message -> {
  			System.out.println("message.body() = "+ message.body());
	});
	}
		
	
	@Override
	public void stop(Future<Void> stopFuture) throws Exception
	{
		System.out.println("My Vertex stopped :");
	}


}
