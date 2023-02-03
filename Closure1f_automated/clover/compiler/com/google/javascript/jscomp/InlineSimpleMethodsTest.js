var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":123,"id":73955,"methods":[{"el":23,"sc":3,"sl":21},{"el":29,"sc":3,"sl":25},{"el":34,"sc":3,"sl":31},{"el":42,"sc":3,"sl":40},{"el":47,"sc":1,"sl":44},{"el":50,"sc":1,"sl":48}],"name":"InlineSimpleMethodsTest","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_102":{"methods":[{"sl":31},{"sl":40},{"sl":48}],"name":"testSimpleInline2203","pass":true,"statements":[{"sl":33},{"sl":41},{"sl":49}]},"test_7":{"methods":[{"sl":31},{"sl":44}],"name":"testNoWarn27","pass":true,"statements":[{"sl":33},{"sl":45},{"sl":46}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [7, 102], [], [7, 102], [], [], [], [], [], [], [102], [102], [], [], [7], [7], [7], [], [102], [102], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
