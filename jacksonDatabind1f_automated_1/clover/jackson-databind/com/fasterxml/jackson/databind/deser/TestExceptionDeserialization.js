var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":80,"id":31700,"methods":[{"el":59,"sc":1,"sl":56},{"el":67,"sc":1,"sl":60}],"name":"TestExceptionDeserialization","sl":13},{"el":40,"id":31700,"methods":[{"el":30,"sc":9,"sl":24},{"el":32,"sc":9,"sl":32},{"el":34,"sc":9,"sl":34},{"el":39,"sc":9,"sl":36}],"name":"TestExceptionDeserialization.MyException","sl":17},{"el":46,"id":31710,"methods":[{"el":45,"sc":9,"sl":45}],"name":"TestExceptionDeserialization.MyNoArgException","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_48":{"methods":[{"sl":60}],"name":"testWithNullMessage55","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66}]},"test_64":{"methods":[{"sl":56}],"name":"testJDK7SuppressionProperty54","pass":true,"statements":[{"sl":57},{"sl":58}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [64], [64], [64], [], [48], [48], [48], [48], [48], [48], [48], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
