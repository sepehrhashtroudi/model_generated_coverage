var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":98,"id":34116,"methods":[{"el":60,"sc":1,"sl":57},{"el":70,"sc":1,"sl":63},{"el":78,"sc":1,"sl":73},{"el":84,"sc":1,"sl":81}],"name":"TestExceptionDeserialization","sl":13},{"el":40,"id":34116,"methods":[{"el":30,"sc":9,"sl":24},{"el":32,"sc":9,"sl":32},{"el":34,"sc":9,"sl":34},{"el":39,"sc":9,"sl":36}],"name":"TestExceptionDeserialization.MyException","sl":17},{"el":46,"id":34126,"methods":[{"el":45,"sc":9,"sl":45}],"name":"TestExceptionDeserialization.MyNoArgException","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_147":{"methods":[{"sl":63}],"name":"testWithNullMessage177","pass":true,"statements":[{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69}]},"test_353":{"methods":[{"sl":45},{"sl":81}],"name":"testNoArgsException179","pass":true,"statements":[{"sl":82},{"sl":83}]},"test_365":{"methods":[{"sl":73}],"name":"testIOException178","pass":true,"statements":[{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_584":{"methods":[{"sl":57}],"name":"testJDK7SuppressionProperty120","pass":true,"statements":[{"sl":58},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [353], [], [], [], [], [], [], [], [], [], [], [], [584], [584], [584], [], [], [], [147], [147], [147], [147], [147], [147], [147], [], [], [], [365], [365], [365], [365], [365], [], [], [], [353], [353], [353], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
