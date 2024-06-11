package org.acme;

import com.github.luben.zstd.RecyclingBufferPool;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Path("/hello")
public class GreetingResource {

    public static void main(String[] args) throws IOException {
        new com.github.luben.zstd.ZstdOutputStreamNoFinalizer(new ByteArrayOutputStream(), RecyclingBufferPool.INSTANCE);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws IOException {
        new com.github.luben.zstd.ZstdOutputStreamNoFinalizer(new ByteArrayOutputStream(), RecyclingBufferPool.INSTANCE);
        return "Hello from Quarkus REST";
    }
}
