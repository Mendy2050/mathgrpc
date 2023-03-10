package grpc.examples.unarymath;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: unaryMath.proto")
public final class MathServiceGrpc {

  private MathServiceGrpc() {}

  public static final String SERVICE_NAME = "math.MathService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.examples.unarymath.CalculateRequest,
      grpc.examples.unarymath.CalculateResponse> getCalculateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculate",
      requestType = grpc.examples.unarymath.CalculateRequest.class,
      responseType = grpc.examples.unarymath.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.examples.unarymath.CalculateRequest,
      grpc.examples.unarymath.CalculateResponse> getCalculateMethod() {
    io.grpc.MethodDescriptor<grpc.examples.unarymath.CalculateRequest, grpc.examples.unarymath.CalculateResponse> getCalculateMethod;
    if ((getCalculateMethod = MathServiceGrpc.getCalculateMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getCalculateMethod = MathServiceGrpc.getCalculateMethod) == null) {
          MathServiceGrpc.getCalculateMethod = getCalculateMethod = 
              io.grpc.MethodDescriptor.<grpc.examples.unarymath.CalculateRequest, grpc.examples.unarymath.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "math.MathService", "calculate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.unarymath.CalculateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.unarymath.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("calculate"))
                  .build();
          }
        }
     }
     return getCalculateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.examples.unarymath.Message,
      grpc.examples.unarymath.Empty> getEmptyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empty",
      requestType = grpc.examples.unarymath.Message.class,
      responseType = grpc.examples.unarymath.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.examples.unarymath.Message,
      grpc.examples.unarymath.Empty> getEmptyMethod() {
    io.grpc.MethodDescriptor<grpc.examples.unarymath.Message, grpc.examples.unarymath.Empty> getEmptyMethod;
    if ((getEmptyMethod = MathServiceGrpc.getEmptyMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getEmptyMethod = MathServiceGrpc.getEmptyMethod) == null) {
          MathServiceGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<grpc.examples.unarymath.Message, grpc.examples.unarymath.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "math.MathService", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.unarymath.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.unarymath.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MathServiceStub newStub(io.grpc.Channel channel) {
    return new MathServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MathServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MathServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MathServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MathServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class MathServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public void calculate(grpc.examples.unarymath.CalculateRequest request,
        io.grpc.stub.StreamObserver<grpc.examples.unarymath.CalculateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public void empty(grpc.examples.unarymath.Message request,
        io.grpc.stub.StreamObserver<grpc.examples.unarymath.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.examples.unarymath.CalculateRequest,
                grpc.examples.unarymath.CalculateResponse>(
                  this, METHODID_CALCULATE)))
          .addMethod(
            getEmptyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.examples.unarymath.Message,
                grpc.examples.unarymath.Empty>(
                  this, METHODID_EMPTY)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MathServiceStub extends io.grpc.stub.AbstractStub<MathServiceStub> {
    private MathServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public void calculate(grpc.examples.unarymath.CalculateRequest request,
        io.grpc.stub.StreamObserver<grpc.examples.unarymath.CalculateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public void empty(grpc.examples.unarymath.Message request,
        io.grpc.stub.StreamObserver<grpc.examples.unarymath.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MathServiceBlockingStub extends io.grpc.stub.AbstractStub<MathServiceBlockingStub> {
    private MathServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public grpc.examples.unarymath.CalculateResponse calculate(grpc.examples.unarymath.CalculateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public grpc.examples.unarymath.Empty empty(grpc.examples.unarymath.Message request) {
      return blockingUnaryCall(
          getChannel(), getEmptyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MathServiceFutureStub extends io.grpc.stub.AbstractStub<MathServiceFutureStub> {
    private MathServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.examples.unarymath.CalculateResponse> calculate(
        grpc.examples.unarymath.CalculateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.examples.unarymath.Empty> empty(
        grpc.examples.unarymath.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE = 0;
  private static final int METHODID_EMPTY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MathServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MathServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE:
          serviceImpl.calculate((grpc.examples.unarymath.CalculateRequest) request,
              (io.grpc.stub.StreamObserver<grpc.examples.unarymath.CalculateResponse>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((grpc.examples.unarymath.Message) request,
              (io.grpc.stub.StreamObserver<grpc.examples.unarymath.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MathServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.examples.unarymath.MathServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MathService");
    }
  }

  private static final class MathServiceFileDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier {
    MathServiceFileDescriptorSupplier() {}
  }

  private static final class MathServiceMethodDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MathServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MathServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MathServiceFileDescriptorSupplier())
              .addMethod(getCalculateMethod())
              .addMethod(getEmptyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
