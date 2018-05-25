//package com.ruleenine.utils;
//
//import org.drools.compiler.compiler.DroolsParserException;
//import org.drools.compiler.compiler.PackageBuilder;
//import org.drools.core.RuleBase;
//import org.drools.core.RuleBaseFactory;
//import org.drools.core.WorkingMemory;
//import org.springframework.core.io.ClassPathResource;
//
//import java.io.*;
//
//
//public class CustomRuleBase {
//    public WorkingMemory executeDrools() throws DroolsParserException, IOException {
//        PackageBuilder packageBuilder = new PackageBuilder();
////        String ruleFile = "rules/overpayment.drl";
////        InputStream ruleStream = getClass().getResourceAsStream(ruleFile);
//        InputStream ruleStream = new ClassPathResource("rules/overpayment.drl").getInputStream();
//        Reader reader = new InputStreamReader(ruleStream);
//        packageBuilder.addPackageFromDrl(reader);
//        org.drools.core.rule.Package rulePackage = packageBuilder.getPackage();
//        RuleBase ruleBase = RuleBaseFactory.newRuleBase();
//        ruleBase.addPackage(rulePackage);
//        return ruleBase.newStatefulSession();
//    }
//}
