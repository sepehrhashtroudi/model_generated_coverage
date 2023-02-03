var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":77,"id":39319,"methods":[{"el":45,"sc":1,"sl":39},{"el":58,"sc":1,"sl":48},{"el":68,"sc":1,"sl":61}],"name":"TestTypeBindings","sl":11},{"el":14,"id":39319,"methods":[],"name":"TestTypeBindings.AbstractType","sl":14},{"el":16,"id":39319,"methods":[],"name":"TestTypeBindings.LongStringType","sl":16},{"el":30,"id":39319,"methods":[{"el":23,"sc":9,"sl":20}],"name":"TestTypeBindings.InnerGenericTyping","sl":18},{"el":29,"id":39321,"methods":[{"el":28,"sc":13,"sl":25}],"name":"TestTypeBindings.InnerGenericTyping.InnerClass","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_270":{"methods":[{"sl":39}],"name":"testSimple482","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44}]},"test_284":{"methods":[{"sl":61}],"name":"testAbstract487","pass":true,"statements":[{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67}]},"test_292":{"methods":[{"sl":48}],"name":"testInnerType486","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [270], [270], [270], [270], [270], [270], [], [], [], [292], [292], [292], [292], [292], [292], [292], [292], [292], [292], [], [], [], [284], [284], [284], [284], [284], [284], [284], [], [], [], [], [], [], [], [], [], []]
