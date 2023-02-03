var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":40107,"methods":[{"el":47,"sc":1,"sl":42}],"name":"TestJsonRawValue","sl":11},{"el":33,"id":40107,"methods":[{"el":26,"sc":9,"sl":26},{"el":28,"sc":9,"sl":28},{"el":30,"sc":9,"sl":30},{"el":32,"sc":9,"sl":32}],"name":"TestJsonRawValue.ClassGetter","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_125":{"methods":[{"sl":26},{"sl":28},{"sl":30},{"sl":32},{"sl":42}],"name":"testNullStringGetter536","pass":true,"statements":[{"sl":26},{"sl":28},{"sl":30},{"sl":32},{"sl":43},{"sl":44},{"sl":45},{"sl":46}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [125], [], [125], [], [125], [], [125], [], [], [], [], [], [], [], [], [], [125], [125], [125], [125], [125], [], [], [], [], [], [], [], [], []]
