var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":77,"id":35828,"methods":[{"el":61,"sc":1,"sl":53},{"el":72,"sc":1,"sl":64}],"name":"TestMixinInheritance","sl":10},{"el":17,"id":35828,"methods":[],"name":"TestMixinInheritance.Beano","sl":14},{"el":22,"id":35828,"methods":[],"name":"TestMixinInheritance.BeanoMixinSuper","sl":19},{"el":27,"id":35828,"methods":[],"name":"TestMixinInheritance.BeanoMixinSub","sl":24},{"el":32,"id":35828,"methods":[{"el":30,"sc":9,"sl":30},{"el":31,"sc":9,"sl":31}],"name":"TestMixinInheritance.Beano2","sl":29},{"el":38,"id":35832,"methods":[],"name":"TestMixinInheritance.BeanoMixinSuper2","sl":34},{"el":44,"id":35832,"methods":[],"name":"TestMixinInheritance.BeanoMixinSub2","sl":40}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_22":{"methods":[{"sl":30},{"sl":31},{"sl":53}],"name":"testMixinMethodInheritance227","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60}]},"test_251":{"methods":[{"sl":64}],"name":"testMixinFieldInheritance405","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [22], [22], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [22], [22], [22], [22], [22], [22], [22], [22], [], [], [], [251], [251], [251], [251], [251], [251], [251], [251], [], [], [], [], [], []]
