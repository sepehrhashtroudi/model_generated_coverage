var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":31246,"methods":[{"el":20,"sc":1,"sl":16},{"el":27,"sc":1,"sl":23}],"name":"TestArraySerialization","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_108":{"methods":[{"sl":16}],"name":"testStringArray217","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19}]},"test_354":{"methods":[{"sl":23}],"name":"testFloatArray571","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [108], [108], [108], [108], [], [], [], [354], [354], [354], [354], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
