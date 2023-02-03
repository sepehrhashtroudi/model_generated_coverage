var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":93,"id":37614,"methods":[{"el":65,"sc":1,"sl":57},{"el":73,"sc":1,"sl":68},{"el":79,"sc":1,"sl":76}],"name":"TestExceptionDeserialization","sl":13},{"el":40,"id":37614,"methods":[{"el":30,"sc":9,"sl":24},{"el":32,"sc":9,"sl":32},{"el":34,"sc":9,"sl":34},{"el":39,"sc":9,"sl":36}],"name":"TestExceptionDeserialization.MyException","sl":17},{"el":46,"id":37624,"methods":[{"el":45,"sc":9,"sl":45}],"name":"TestExceptionDeserialization.MyNoArgException","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_175":{"methods":[{"sl":24},{"sl":32},{"sl":34},{"sl":36},{"sl":57}],"name":"testWithCreator35","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":32},{"sl":34},{"sl":38},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64}]},"test_237":{"methods":[{"sl":68}],"name":"testIOException186","pass":true,"statements":[{"sl":69},{"sl":70},{"sl":71},{"sl":72}]},"test_251":{"methods":[{"sl":45},{"sl":76}],"name":"testNoArgsException187","pass":true,"statements":[{"sl":77},{"sl":78}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [175], [], [], [175], [175], [175], [], [], [175], [], [175], [], [175], [], [175], [], [], [], [], [], [], [251], [], [], [], [], [], [], [], [], [], [], [], [175], [175], [175], [175], [175], [175], [175], [175], [], [], [], [237], [237], [237], [237], [237], [], [], [], [251], [251], [251], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
