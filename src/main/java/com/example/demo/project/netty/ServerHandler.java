/*
package com.example.demo.project.netty;

import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.util.ReferenceCountUtil;
import io.netty.util.concurrent.DefaultEventExecutorGroup;
import io.netty.util.concurrent.EventExecutorGroup;

import java.io.UnsupportedEncodingException;

public class ServerHandler extends ChannelInboundHandlerAdapter {

	private final EventExecutorGroup group =  new DefaultEventExecutorGroup(100);

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
			ChannelFuture future = null;
			try {
				future = ctx.writeAndFlush(Unpooled.copiedBuffer("test".getBytes("gbk")));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			future.addListener((ChannelFutureListener) future1 ->{
				if(future1.isDone()){
					ctx.close();
					ReferenceCountUtil.release(msg);
				}
			});
	}
}
*/
