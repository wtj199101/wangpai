package com.wp.cloud.wangpai.zuul;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class WangpaiZuulServiceApplicationTests {

//	@Test
	public void contextLoads() throws Exception{

	}

	public static void main(String[] args) throws Exception {
		final CountDownLatch begin=new CountDownLatch(1);
		final CountDownLatch end=new CountDownLatch(10);
		final ExecutorService exec= Executors.newFixedThreadPool(10);
		for (int i=0;i<10;i++) {
			final int no = i + 1;
			Runnable run = new Runnable() {
				@Override
				public void run() {
					try {
						begin.await();
						Thread.sleep((long) Math.random() * 10000L);
						System.out.println("no:" + no + " arrived");
					} catch (Exception e) {

					} finally {
						end.countDown();
					}
				}

			};
            exec.submit(run);
        }
			System.out.println("game begin");

			begin.countDown();
			end.await();
			System.out.println("game over");
			exec.shutdown();
	}

}
