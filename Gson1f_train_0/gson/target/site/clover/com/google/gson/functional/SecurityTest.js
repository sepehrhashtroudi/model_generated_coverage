var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":77,"id":6001,"methods":[{"el":42,"sc":3,"sl":38},{"el":51,"sc":1,"sl":45},{"el":58,"sc":1,"sl":54}],"name":"SecurityTest","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_128":{"methods":[{"sl":54}],"name":"testNonExecutableJsonSerialization159","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57}]},"test_143":{"methods":[{"sl":45}],"name":"testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization76","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [143], [143], [143], [143], [143], [143], [], [], [], [128], [128], [128], [128], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
