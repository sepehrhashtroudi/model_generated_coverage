var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":57,"id":30696,"methods":[],"name":"TestAutoDetect","sl":14},{"el":23,"id":30696,"methods":[],"name":"TestAutoDetect.FieldBean","sl":17},{"el":26,"id":30696,"methods":[],"name":"TestAutoDetect.ProtFieldBean","sl":26},{"el":34,"id":30696,"methods":[{"el":30,"sc":9,"sl":30},{"el":31,"sc":9,"sl":31},{"el":33,"sc":9,"sl":32}],"name":"TestAutoDetect.MethodBean","sl":28},{"el":37,"id":30702,"methods":[],"name":"TestAutoDetect.ProtMethodBean","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
