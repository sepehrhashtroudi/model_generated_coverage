var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":75,"id":33618,"methods":[],"name":"TestAnnotatedClass","sl":13},{"el":29,"id":33618,"methods":[{"el":26,"sc":9,"sl":26},{"el":28,"sc":9,"sl":28}],"name":"TestAnnotatedClass.BaseClass","sl":22},{"el":37,"id":33621,"methods":[{"el":33,"sc":9,"sl":33},{"el":34,"sc":9,"sl":34},{"el":36,"sc":9,"sl":36}],"name":"TestAnnotatedClass.SubClass","sl":31},{"el":42,"id":33627,"methods":[],"name":"TestAnnotatedClass.GenericBase","sl":39},{"el":49,"id":33627,"methods":[{"el":48,"sc":9,"sl":47}],"name":"TestAnnotatedClass.NumberBean","sl":44},{"el":66,"id":33628,"methods":[],"name":"TestAnnotatedClass.FieldBean","sl":56}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
