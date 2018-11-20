package com.ghost.pattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryManagerMXBean;
import java.lang.management.MemoryPoolMXBean;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatternApplicationTests {

	@Test
	public void contextLoads() {

		System.out.println("123");

	}

	@Test
	public void objectsTest()
	{

		System.out.println(this.toString());
		System.out.println(Objects.toString(this));

	}

	@Test
	public void classLoaderTest()
	{

        System.out.println(this.getClass().getClassLoader().getParent());


	}

	@Test
	public void systemTest()
    {

//        System.load("");

        System.out.println(System.getenv());


    }


    @Test
    public void binaryTest()
    {

        long x=10_0000_000000L;
        System.out.println(x);



    }

    @Test
    public void memoryTest()
    {

        List<MemoryPoolMXBean> pools= ManagementFactory.getMemoryPoolMXBeans();
        int poolsFound=0;
        int poolsWithStats=0;
        for (int i=0;i<pools.size();i++)
        {
            MemoryPoolMXBean pool=pools.get(i);
            String name=pool.getName();
            System.out.println("found pool:--->"+name);

        }


    }

    public void inputTest()
    {

        InputStream inputStream;

    }


    @Test
    public void csvTest()
    {

        CSVProcessor.main(new String[]{"sort","counter","DESC","E:\\Workspaces_Java_EE\\pattern\\target\\test-classes\\com\\ghost\\pattern\\06-08.csv"});


    }

    @Test
    public void passwordTest()
    {

        PasswordGenerator.main(new String[]{"12"});

    }

    @Test
    public void lamdaTest()
    {
        IntStream.rangeClosed(0,9).forEach(System.out::println);
    }

    @Test
    public void threadTest()
    {

        Runnable sleep=()-> System.out.println("--------------------------");
        new Thread(sleep).start();
    }

    @Test
    public void mathTest()
    {
        System.out.println((6/10));
        Math.ceil(1/2);
    }


}
