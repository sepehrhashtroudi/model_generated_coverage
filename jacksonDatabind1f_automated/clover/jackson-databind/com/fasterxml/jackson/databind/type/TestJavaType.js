var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":33043,"methods":[],"name":"TestJavaType","sl":11},{"el":14,"id":33043,"methods":[],"name":"TestJavaType.BaseType","sl":14},{"el":16,"id":33043,"methods":[],"name":"TestJavaType.SubType","sl":16},{"el":18,"id":33043,"methods":[],"name":"TestJavaType.MyEnum","sl":18},{"el":23,"id":33043,"methods":[{"el":22,"sc":9,"sl":22}],"name":"TestJavaType.MyEnum2","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
