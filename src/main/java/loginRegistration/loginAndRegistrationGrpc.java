package loginRegistration;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Hello.proto")
public final class loginAndRegistrationGrpc {

  private loginAndRegistrationGrpc() {}

  public static final String SERVICE_NAME = "loginRegistration.loginAndRegistration";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<loginRegistration.registration,
      loginRegistration.response> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = loginRegistration.registration.class,
      responseType = loginRegistration.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<loginRegistration.registration,
      loginRegistration.response> getRegisterMethod() {
    io.grpc.MethodDescriptor<loginRegistration.registration, loginRegistration.response> getRegisterMethod;
    if ((getRegisterMethod = loginAndRegistrationGrpc.getRegisterMethod) == null) {
      synchronized (loginAndRegistrationGrpc.class) {
        if ((getRegisterMethod = loginAndRegistrationGrpc.getRegisterMethod) == null) {
          loginAndRegistrationGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<loginRegistration.registration, loginRegistration.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "loginRegistration.loginAndRegistration", "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  loginRegistration.registration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  loginRegistration.response.getDefaultInstance()))
                  .setSchemaDescriptor(new loginAndRegistrationMethodDescriptorSupplier("Register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<loginRegistration.login,
      loginRegistration.response> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = loginRegistration.login.class,
      responseType = loginRegistration.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<loginRegistration.login,
      loginRegistration.response> getLoginMethod() {
    io.grpc.MethodDescriptor<loginRegistration.login, loginRegistration.response> getLoginMethod;
    if ((getLoginMethod = loginAndRegistrationGrpc.getLoginMethod) == null) {
      synchronized (loginAndRegistrationGrpc.class) {
        if ((getLoginMethod = loginAndRegistrationGrpc.getLoginMethod) == null) {
          loginAndRegistrationGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<loginRegistration.login, loginRegistration.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "loginRegistration.loginAndRegistration", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  loginRegistration.login.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  loginRegistration.response.getDefaultInstance()))
                  .setSchemaDescriptor(new loginAndRegistrationMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<loginRegistration.changePassword,
      loginRegistration.response> getChangePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangePassword",
      requestType = loginRegistration.changePassword.class,
      responseType = loginRegistration.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<loginRegistration.changePassword,
      loginRegistration.response> getChangePasswordMethod() {
    io.grpc.MethodDescriptor<loginRegistration.changePassword, loginRegistration.response> getChangePasswordMethod;
    if ((getChangePasswordMethod = loginAndRegistrationGrpc.getChangePasswordMethod) == null) {
      synchronized (loginAndRegistrationGrpc.class) {
        if ((getChangePasswordMethod = loginAndRegistrationGrpc.getChangePasswordMethod) == null) {
          loginAndRegistrationGrpc.getChangePasswordMethod = getChangePasswordMethod = 
              io.grpc.MethodDescriptor.<loginRegistration.changePassword, loginRegistration.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "loginRegistration.loginAndRegistration", "ChangePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  loginRegistration.changePassword.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  loginRegistration.response.getDefaultInstance()))
                  .setSchemaDescriptor(new loginAndRegistrationMethodDescriptorSupplier("ChangePassword"))
                  .build();
          }
        }
     }
     return getChangePasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static loginAndRegistrationStub newStub(io.grpc.Channel channel) {
    return new loginAndRegistrationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static loginAndRegistrationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new loginAndRegistrationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static loginAndRegistrationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new loginAndRegistrationFutureStub(channel);
  }

  /**
   */
  public static abstract class loginAndRegistrationImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(loginRegistration.registration request,
        io.grpc.stub.StreamObserver<loginRegistration.response> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void login(loginRegistration.login request,
        io.grpc.stub.StreamObserver<loginRegistration.response> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void changePassword(loginRegistration.changePassword request,
        io.grpc.stub.StreamObserver<loginRegistration.response> responseObserver) {
      asyncUnimplementedUnaryCall(getChangePasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                loginRegistration.registration,
                loginRegistration.response>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                loginRegistration.login,
                loginRegistration.response>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getChangePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                loginRegistration.changePassword,
                loginRegistration.response>(
                  this, METHODID_CHANGE_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class loginAndRegistrationStub extends io.grpc.stub.AbstractStub<loginAndRegistrationStub> {
    private loginAndRegistrationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private loginAndRegistrationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected loginAndRegistrationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new loginAndRegistrationStub(channel, callOptions);
    }

    /**
     */
    public void register(loginRegistration.registration request,
        io.grpc.stub.StreamObserver<loginRegistration.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(loginRegistration.login request,
        io.grpc.stub.StreamObserver<loginRegistration.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changePassword(loginRegistration.changePassword request,
        io.grpc.stub.StreamObserver<loginRegistration.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class loginAndRegistrationBlockingStub extends io.grpc.stub.AbstractStub<loginAndRegistrationBlockingStub> {
    private loginAndRegistrationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private loginAndRegistrationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected loginAndRegistrationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new loginAndRegistrationBlockingStub(channel, callOptions);
    }

    /**
     */
    public loginRegistration.response register(loginRegistration.registration request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public loginRegistration.response login(loginRegistration.login request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public loginRegistration.response changePassword(loginRegistration.changePassword request) {
      return blockingUnaryCall(
          getChannel(), getChangePasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class loginAndRegistrationFutureStub extends io.grpc.stub.AbstractStub<loginAndRegistrationFutureStub> {
    private loginAndRegistrationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private loginAndRegistrationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected loginAndRegistrationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new loginAndRegistrationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<loginRegistration.response> register(
        loginRegistration.registration request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<loginRegistration.response> login(
        loginRegistration.login request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<loginRegistration.response> changePassword(
        loginRegistration.changePassword request) {
      return futureUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_CHANGE_PASSWORD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final loginAndRegistrationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(loginAndRegistrationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((loginRegistration.registration) request,
              (io.grpc.stub.StreamObserver<loginRegistration.response>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((loginRegistration.login) request,
              (io.grpc.stub.StreamObserver<loginRegistration.response>) responseObserver);
          break;
        case METHODID_CHANGE_PASSWORD:
          serviceImpl.changePassword((loginRegistration.changePassword) request,
              (io.grpc.stub.StreamObserver<loginRegistration.response>) responseObserver);
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

  private static abstract class loginAndRegistrationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    loginAndRegistrationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return loginRegistration.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("loginAndRegistration");
    }
  }

  private static final class loginAndRegistrationFileDescriptorSupplier
      extends loginAndRegistrationBaseDescriptorSupplier {
    loginAndRegistrationFileDescriptorSupplier() {}
  }

  private static final class loginAndRegistrationMethodDescriptorSupplier
      extends loginAndRegistrationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    loginAndRegistrationMethodDescriptorSupplier(String methodName) {
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
      synchronized (loginAndRegistrationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new loginAndRegistrationFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getLoginMethod())
              .addMethod(getChangePasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
