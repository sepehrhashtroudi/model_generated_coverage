var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":77,"id":4500,"methods":[{"el":42,"sc":1,"sl":35},{"el":50,"sc":1,"sl":45},{"el":58,"sc":1,"sl":53}],"name":"TypeInfoTest","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_150":{"methods":[{"sl":53}],"name":"testObjectType190","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57}]},"test_92":{"methods":[{"sl":35}],"name":"testStrangeTypeParameters151","pass":true,"statements":[{"sl":36},{"sl":37}]},"test_97":{"methods":[{"sl":45}],"name":"testObject163","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [92], [92], [92], [], [], [], [], [], [], [], [97], [97], [97], [97], [97], [], [], [], [150], [150], [150], [150], [150], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
