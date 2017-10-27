[Ivy]
[>Created: Fri Oct 27 20:08:43 ICT 2017]
15F5DB5C89AAD7F1 3.18 #module
>Proto >Proto Collection #zClass
se0 startDownloadSwaggerFile Big #zClass
se0 B #cInfo
se0 #process
se0 @TextInP .resExport .resExport #zField
se0 @TextInP .type .type #zField
se0 @TextInP .processKind .processKind #zField
se0 @AnnotationInP-0n ai ai #zField
se0 @MessageFlowInP-0n messageIn messageIn #zField
se0 @MessageFlowOutP-0n messageOut messageOut #zField
se0 @TextInP .xml .xml #zField
se0 @TextInP .responsibility .responsibility #zField
se0 @StartRequest f0 '' #zField
se0 @Page f1 '' #zField
se0 @PushWFArc f4 '' #zField
se0 @GridStep f3 '' #zField
>Proto se0 se0 startDownloadSwaggerFile #zField
se0 f0 outLink start.ivp #txt
se0 f0 type ch.axonivy.demo.Data #txt
se0 f0 inParamDecl '<> param;' #txt
se0 f0 actionDecl 'ch.axonivy.demo.Data out;
' #txt
se0 f0 guid 15F5DB5C9C6BC021 #txt
se0 f0 requestEnabled true #txt
se0 f0 triggerEnabled false #txt
se0 f0 callSignature start() #txt
se0 f0 persist false #txt
se0 f0 taskData 'TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody' #txt
se0 f0 showInStartList 0 #txt
se0 f0 taskAndCaseSetupAction 'import ch.ivyteam.ivy.workflow.TaskUpdateDefinition;
ch.ivyteam.ivy.workflow.TaskUpdateDefinition taskUpdDef = new ch.ivyteam.ivy.workflow.TaskUpdateDefinition();
import ch.ivyteam.ivy.request.impl.DefaultCalendarProxy;
DefaultCalendarProxy calendarProxy = ivy.cal as DefaultCalendarProxy;
taskUpdDef.setPriority(ch.ivyteam.ivy.workflow.WorkflowPriority.valueOf(2));
taskUpdDef.setExpiryActivator("Everybody");
taskUpdDef.setExpiryPriority(ch.ivyteam.ivy.workflow.WorkflowPriority.valueOf(2));
engine.updateCurrentTask(taskUpdDef);
' #txt
se0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start.ivp</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
se0 f0 @C|.responsibility Everybody #txt
se0 f0 81 49 30 30 -21 17 #rect
se0 f0 @|StartRequestIcon #fIcon
se0 f1 template "generated\\swagger.yaml" #txt
se0 f1 type ch.axonivy.demo.Data #txt
se0 f1 skipLink skip.ivp #txt
se0 f1 sortLink sort.ivp #txt
se0 f1 templateWizard '#
#Fri Oct 27 19:22:56 ICT 2017
' #txt
se0 f1 pageArchivingActivated false #txt
se0 f1 @C|.responsibility Everybody #txt
se0 f1 456 42 112 44 0 -8 #rect
se0 f1 @|PageIcon #fIcon
se0 f4 expr out #txt
se0 f4 109 70 285 162 #arcP
se0 f3 actionDecl 'ch.axonivy.demo.Data out;
' #txt
se0 f3 actionTable 'out=in;
' #txt
se0 f3 actionCode 'import ch.axonivy.demo.util.SwaggerFileReader;
SwaggerFileReader.readSwaggerFile("webContent/generated/swagger.yaml");' #txt
se0 f3 type ch.axonivy.demo.Data #txt
se0 f3 272 162 112 44 0 -8 #rect
se0 f3 @|StepIcon #fIcon
>Proto se0 .type ch.axonivy.demo.Data #txt
>Proto se0 .processKind NORMAL #txt
>Proto se0 0 0 32 24 18 0 #rect
>Proto se0 @|BIcon #fIcon
se0 f0 mainOut f4 tail #connect
se0 f4 head f3 mainIn #connect
