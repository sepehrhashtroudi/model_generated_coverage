var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":64,"id":30709,"methods":[{"el":48,"sc":1,"sl":42},{"el":56,"sc":1,"sl":51}],"name":"TestJsonRawValue","sl":11},{"el":33,"id":30709,"methods":[{"el":26,"sc":9,"sl":26},{"el":28,"sc":9,"sl":28},{"el":30,"sc":9,"sl":30},{"el":32,"sc":9,"sl":32}],"name":"TestJsonRawValue.ClassGetter","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_282":{"methods":[{"sl":26},{"sl":28},{"sl":30},{"sl":32},{"sl":51}],"name":"testNullStringGetter529","pass":true,"statements":[{"sl":26},{"sl":28},{"sl":30},{"sl":32},{"sl":52},{"sl":53},{"sl":54},{"sl":55}]},"test_8":{"methods":[{"sl":26},{"sl":28},{"sl":30},{"sl":32},{"sl":42}],"name":"testSimpleStringGetter11","pass":true,"statements":[{"sl":26},{"sl":28},{"sl":30},{"sl":32},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [8, 282], [], [8, 282], [], [8, 282], [], [8, 282], [], [], [], [], [], [], [], [], [], [8], [8], [8], [8], [8], [8], [], [], [], [282], [282], [282], [282], [282], [], [], [], [], [], [], [], [], []]
