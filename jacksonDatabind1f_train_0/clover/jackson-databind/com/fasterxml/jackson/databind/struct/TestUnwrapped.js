var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":138,"id":32096,"methods":[],"name":"TestUnwrapped","sl":10},{"el":22,"id":32096,"methods":[{"el":17,"sc":9,"sl":17},{"el":21,"sc":9,"sl":18}],"name":"TestUnwrapped.Unwrapping","sl":12},{"el":33,"id":32100,"methods":[{"el":29,"sc":9,"sl":29},{"el":32,"sc":9,"sl":30}],"name":"TestUnwrapped.DeepUnwrapping","sl":24},{"el":45,"id":32103,"methods":[{"el":44,"sc":9,"sl":41}],"name":"TestUnwrapped.UnwrappingWithCreator","sl":35},{"el":56,"id":32105,"methods":[{"el":51,"sc":9,"sl":51},{"el":55,"sc":9,"sl":52}],"name":"TestUnwrapped.Location","sl":47},{"el":66,"id":32109,"methods":[{"el":65,"sc":9,"sl":65}],"name":"TestUnwrapped.TwoUnwrappedProperties","sl":59},{"el":70,"id":32110,"methods":[],"name":"TestUnwrapped.Name","sl":68}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
