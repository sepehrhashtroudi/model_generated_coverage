var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":66,"id":33433,"methods":[],"name":"TestClassUtil","sl":11},{"el":27,"id":33433,"methods":[{"el":26,"sc":9,"sl":26}],"name":"TestClassUtil.BaseClass","sl":23},{"el":29,"id":33434,"methods":[],"name":"TestClassUtil.BaseInt","sl":29},{"el":31,"id":33434,"methods":[],"name":"TestClassUtil.SubInt","sl":31},{"el":33,"id":33434,"methods":[],"name":"TestClassUtil.TestEnum","sl":33},{"el":35,"id":33434,"methods":[],"name":"TestClassUtil.InnerNonStatic","sl":35},{"el":41,"id":33434,"methods":[{"el":40,"sc":9,"sl":38}],"name":"TestClassUtil.Inner","sl":37},{"el":47,"id":33436,"methods":[{"el":46,"sc":9,"sl":46}],"name":"TestClassUtil.SubClass","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
