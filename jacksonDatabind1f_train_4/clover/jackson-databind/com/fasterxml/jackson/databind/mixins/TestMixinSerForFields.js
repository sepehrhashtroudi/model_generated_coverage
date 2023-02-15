var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":75,"id":35300,"methods":[{"el":70,"sc":1,"sl":60}],"name":"TestMixinSerForFields","sl":10},{"el":28,"id":35300,"methods":[{"el":27,"sc":9,"sl":24}],"name":"TestMixinSerForFields.BaseClass","sl":19},{"el":36,"id":35303,"methods":[{"el":35,"sc":9,"sl":33}],"name":"TestMixinSerForFields.SubClass","sl":30},{"el":42,"id":35305,"methods":[],"name":"TestMixinSerForFields.MixIn","sl":38},{"el":51,"id":35305,"methods":[],"name":"TestMixinSerForFields.MixIn2","sl":44}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_225":{"methods":[{"sl":24},{"sl":33},{"sl":60}],"name":"testMultipleFieldMixIns289","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":34},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [225], [225], [225], [], [], [], [], [], [], [225], [225], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [225], [225], [225], [225], [225], [225], [225], [225], [225], [225], [], [], [], [], [], []]
