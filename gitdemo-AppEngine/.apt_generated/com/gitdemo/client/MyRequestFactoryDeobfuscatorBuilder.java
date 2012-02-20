// Automatically Generated -- DO NOT EDIT
// com.gitdemo.client.MyRequestFactory
package com.gitdemo.client;
import java.util.Arrays;
import com.google.web.bindery.requestfactory.vm.impl.OperationData;
import com.google.web.bindery.requestfactory.vm.impl.OperationKey;
public final class MyRequestFactoryDeobfuscatorBuilder extends com.google.web.bindery.requestfactory.vm.impl.Deobfuscator.Builder {
{
withOperation(new OperationKey("IUzY61EVftOM91C5rpLokeRVzCQ="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/InstanceRequest;")
  .withDomainMethodDescriptor("()Ljava/lang/String;")
  .withMethodName("send")
  .withRequestContext("com.gitdemo.client.MyRequestFactory$MessageRequest")
  .build());
withOperation(new OperationKey("FIBlXTQ4sDRfyia_0ihhiXGW5$c="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/Request;")
  .withDomainMethodDescriptor("()Ljava/lang/String;")
  .withMethodName("getMessage")
  .withRequestContext("com.gitdemo.client.MyRequestFactory$HelloWorldRequest")
  .build());
withOperation(new OperationKey("qjtiSmdsIrdE6T6jWmysedGFijg="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/InstanceRequest;")
  .withDomainMethodDescriptor("()V")
  .withMethodName("register")
  .withRequestContext("com.gitdemo.client.MyRequestFactory$RegistrationInfoRequest")
  .build());
withOperation(new OperationKey("Bjsa3452vHioa40AFuRI4YuOWe8="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/InstanceRequest;")
  .withDomainMethodDescriptor("()V")
  .withMethodName("unregister")
  .withRequestContext("com.gitdemo.client.MyRequestFactory$RegistrationInfoRequest")
  .build());
withRawTypeToken("roLoyCSEdpSDVq3eKFheGjbDtn0=", "com.gitdemo.shared.MessageProxy");
withRawTypeToken("r60Kt1$SvK8jYzOxZeAZtfdcxkU=", "com.gitdemo.shared.RegistrationInfoProxy");
withRawTypeToken("8KVVbwaaAtl6KgQNlOTsLCp9TIU=", "com.google.web.bindery.requestfactory.shared.ValueProxy");
withRawTypeToken("FXHD5YU0TiUl3uBaepdkYaowx9k=", "com.google.web.bindery.requestfactory.shared.BaseProxy");
withClientToDomainMappings("com.gitdemo.server.Message", Arrays.asList("com.gitdemo.shared.MessageProxy"));
withClientToDomainMappings("com.gitdemo.server.RegistrationInfo", Arrays.asList("com.gitdemo.shared.RegistrationInfoProxy"));
}}
