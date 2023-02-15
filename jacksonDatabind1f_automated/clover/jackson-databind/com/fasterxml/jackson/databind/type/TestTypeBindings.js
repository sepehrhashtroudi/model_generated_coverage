var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":30894,"methods":[],"name":"TestTypeBindings","sl":11},{"el":14,"id":30894,"methods":[],"name":"TestTypeBindings.AbstractType","sl":14},{"el":16,"id":30894,"methods":[],"name":"TestTypeBindings.LongStringType","sl":16},{"el":30,"id":30894,"methods":[{"el":23,"sc":9,"sl":20}],"name":"TestTypeBindings.InnerGenericTyping","sl":18},{"el":29,"id":30896,"methods":[{"el":28,"sc":13,"sl":25}],"name":"TestTypeBindings.InnerGenericTyping.InnerClass","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
